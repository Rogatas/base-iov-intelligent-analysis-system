var speedData = [];
var enginespeedData = [];
var enginetemData = [];
var engineloadData = [];



$(function () {

    $.ajax({
        type:'post',
        dataType:'json',
        url:getContextPath+'/catalog/vehicleRangePercentCount/showdata/speed.do',//请求数据的地址
        success:function(data){
            if(data == null || data.length == 0){
                alert("不存在数据");
                return;
            }

            //迭代，把异步获取的数据放到数组中
            $.each(data,function(i,d){
                speedData.push([d.vehicleSpeed,d.num]);
            });
        },
        error:function(e){
            alert("error");
        }
    });


    $.ajax({
        type:'post',
        dataType:'json',
        url:getContextPath+'/catalog/vehicleRangePercentCount/showdata/enginespeed.do',//请求数据的地址
        success:function(data){
            if(data == null || data.length == 0){
                alert("不存在数据");
                return;
            }

            //迭代，把异步获取的数据放到数组中
            $.each(data,function(i,d){
                enginespeedData.push([d.vehicleEngineSpeed,d.num]);
            });
        },
        error:function(e){
            alert("error");
        }
    });

    $.ajax({
        type:'post',
        dataType:'json',
        url:getContextPath+'/catalog/vehicleRangePercentCount/showdata/enginetem.do',//请求数据的地址
        success:function(data){
            if(data == null || data.length == 0){
                alert("不存在数据");
                return;
            }

            //迭代，把异步获取的数据放到数组中
            $.each(data,function(i,d){
                enginetemData.push([d.vehicleEngineTem,d.num]);
            });
        },
        error:function(e){
            alert("error");
        }
    });

    $.ajax({
        type:'post',
        dataType:'json',
        url:getContextPath+'/catalog/vehicleRangePercentCount/showdata/engineload.do',//请求数据的地址
        success:function(data){
            if(data == null || data.length == 0){
                alert("不存在数据");
                return;
            }

            //迭代，把异步获取的数据放到数组中
            $.each(data,function(i,d){
                engineloadData.push([d.vehicleEngineLoad,d.num]);
            });
        },
        error:function(e){
            alert("error");
        }
    });

    $(document).ready(function() {
        //每隔1秒自动调用方法，实现图表的实时更新
        //window.setInterval(getHighchats,3000);
        window.setTimeout(getSpeed,1000);
        window.setTimeout(getEngineSpeed,1000);
        window.setTimeout(getEngineTem,1000);
        window.setTimeout(getEngineLoad,1000);

    });


});



function getSpeed(){

    $('#containerSpeed').highcharts({
        credits: {  enabled: false},    //去掉highcharts.com商标
        exporting: { enabled: false },  //去掉chart不必要属性
        chart: {
            plotBackgroundColor: null,
            plotBorderWidth: null,
            plotShadow: false,
            type: 'pie'
        },
        title: {
            text: '车辆速度范围百分比统计'
        },
        tooltip: {
            pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
        },
        plotOptions: {
            pie: {
                allowPointSelect: true,
                cursor: 'pointer',
                dataLabels: {
                    enabled: true,
                    format: '<b>{point.name}</b>: {point.percentage:.1f} %',
                    style: {
                        color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black'
                    }
                }
            }
        },
        series: [{
            name: '车辆速度范围',
            colorByPoint: true,
            data: speedData
        }]
    });

}



function getEngineSpeed(){
    // Radialize the colors
    Highcharts.getOptions().colors = Highcharts.map(Highcharts.getOptions().colors, function (color) {
        return {
            radialGradient: {
                cx: 0.5,
                cy: 0.3,
                r: 0.7
            },
            stops: [
                [0, color],
                [1, Highcharts.Color(color).brighten(-0.3).get('rgb')] // darken
            ]
        };
    });

    // Build the chart
    $('#containerEngineSpeed').highcharts({
        credits: {  enabled: false},    //去掉highcharts.com商标
        exporting: { enabled: false },  //去掉chart不必要属性
        chart: {
            plotBackgroundColor: null,
            plotBorderWidth: null,
            plotShadow: false,
            type: 'pie'
        },
        title: {
            text: '车辆引擎速度范围百分比统计'
        },
        tooltip: {
            pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
        },
        plotOptions: {
            pie: {
                allowPointSelect: true,
                cursor: 'pointer',
                dataLabels: {
                    enabled: true,
                    format: '<b>{point.name}</b>: {point.percentage:.1f} %',
                    style: {
                        color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black'
                    },
                    connectorColor: 'silver'
                }
            }
        },
        series: [{
            name: '车辆引擎速度范围',
            data: enginespeedData
        }]
    });

}


function getEngineTem(){

    $('#containerEngineTem').highcharts({
        credits: {  enabled: false},    //去掉highcharts.com商标
        exporting: { enabled: false },  //去掉chart不必要属性
        chart: {
            type: 'pie',
            options3d: {
                enabled: true,
                alpha: 45,
                beta: 0
            }
        },
        title: {
            text: '车辆引擎速度范围百分比统计'
        },
        tooltip: {
            pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
        },
        plotOptions: {
            pie: {
                allowPointSelect: true,
                cursor: 'pointer',
                depth: 35,
                dataLabels: {
                    enabled: true,
                    format: '{point.name}'
                }
            }
        },
        series: [{
            type: 'pie',
            name: '车辆引擎温度范围',
            data: enginetemData
        }]
    });


}


function getEngineLoad(){


    // Build the chart
    $('#containerEngineLoad').highcharts({
        credits: {  enabled: false},    //去掉highcharts.com商标
        exporting: { enabled: false },  //去掉chart不必要属性
        chart: {
            plotBackgroundColor: null,
            plotBorderWidth: null,
            plotShadow: false,
            type: 'pie'
        },
        title: {
            text: '车辆引擎负荷范围百分比统计'
        },
        tooltip: {
            pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
        },
        plotOptions: {
            pie: {
                allowPointSelect: true,
                cursor: 'pointer',
                dataLabels: {
                    enabled: false
                },
                showInLegend: true
            }
        },
        series: [{
            name: '车辆引擎负荷范围',
            colorByPoint: true,
            data: engineloadData
        }]

    });

}


