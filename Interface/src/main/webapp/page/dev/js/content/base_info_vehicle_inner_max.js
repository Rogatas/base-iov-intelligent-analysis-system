var categoriesArr = [];
var seriesQilWear = [];
var seriesIntakeTem = [];
var seriesAirFlow = [];
var seriesBatteryVoltage = [];
var seriesCoolantTem = [];

$(function ()
{
    $.ajax({
        type:'post',
        dataType:'json',
        url:getContextPath+'/catalog/baseInfoVehicleInner/showdata/max.do',//请求数据的地址
        success:function(data){
            if(data == null || data.length == 0){
                alert("不存在数据");
                return;
            }

            //迭代，把异步获取的数据放到数组中
            $.each(data,function(i,d){

                categoriesArr.push(d.innerId);

                seriesQilWear.push(d.maxOilWear);
                seriesIntakeTem.push(d.maxIntakeTem);
                seriesAirFlow.push(d.maxAirFlow);
                seriesBatteryVoltage.push(d.maxBatteryVoltage);
                seriesCoolantTem.push(d.maxCoolantTem);
            });

        },
        error:function(e){
            alert("error");
        }
    });

    $(document).ready(function() {
        //每隔3秒自动调用方法，实现图表的实时更新
        //window.setInterval(getHighchats,3000);
        window.setTimeout(getHighchats,1000);
    });

});

function getHighchats(){

    //$('#container').highcharts({
    //    credits: {  enabled: false},    //去掉highcharts.com商标
    //    exporting: { enabled: false },  //去掉chart不必要属性
    //    title: {
    //        text: '基于汽车ID为维度的均值统计',
    //        x: -20 //center
    //    },
    //    subtitle: {
    //        text: '参数值：平均油耗，平均进气温度，平均空气流量，平均电瓶电压，平均冷却液水温',
    //        x: -20
    //    },
    //    xAxis: {
    //        categories: categoriesArr
    //    },
    //    yAxis: {
    //        title: {
    //            text: ' Units '
    //        },
    //        plotLines: [{
    //            value: 0,
    //            width: 1,
    //            color: '#808080'
    //        }]
    //    },
    //    tooltip: {
    //        valueSuffix: ' '
    //    },
    //    legend: {
    //        layout: 'vertical',
    //        align: 'right',
    //        verticalAlign: 'middle',
    //        borderWidth: 0
    //    },
    //    series: [{
    //        name: '平均油耗（KM/L）',
    //        data: seriesQilWear
    //    }, {
    //        name: '平均进气温度（°C）',
    //        data: seriesIntakeTem
    //    }, {
    //        name: '平均空气流量（g/s）',
    //        data: seriesAirFlow
    //    }, {
    //        name: '平均电瓶电压（V）',
    //        data: seriesBatteryVoltage
    //    }, {
    //        name: '平均冷却液水温（°C）',
    //        data: seriesCoolantTem
    //    }]
    //});


    $('#container').highcharts({
        credits: {  enabled: false},    //去掉highcharts.com商标
        exporting: { enabled: false },  //去掉chart不必要属性
        chart: {
            type: 'line'
        },
        title: {
            text: '基于汽车ID为维度的最大统计'
        },
        subtitle: {
            text: '参数值：最大油耗，最大进气温度，最大空气流量，最大电瓶电压，最大冷却液水温'
        },
        xAxis: {
            categories: categoriesArr
        },
        yAxis: {
            title: {
                text: ' Units '
            }
        },
        plotOptions: {
            line: {
                dataLabels: {
                    enabled: true
                },
                enableMouseTracking: false
            }
        },
        series: [{
            name: '最大油耗（KM/L）',
            data: seriesQilWear
        }, {
            name: '最大进气温度（°C）',
            data: seriesIntakeTem
        }, {
            name: '最大空气流量（g/s）',
            data: seriesAirFlow
        }, {
            name: '最大电瓶电压（V）',
            data: seriesBatteryVoltage
        }, {
            name: '最大冷却液水温（°C）',
            data: seriesCoolantTem
        }]
    });

}