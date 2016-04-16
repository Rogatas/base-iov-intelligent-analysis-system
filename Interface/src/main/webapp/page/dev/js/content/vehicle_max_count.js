var categoriesArr = new Array();
var seriesMaxSpeed = new Array();
var seriesMaxMileage = new Array();
var seriesMaxEngineSpeed = new Array();
var seriesMaxEngineTem = new Array();
var seriesMaxEngineLoad = new Array();
$(function ()
{
    $.ajax({
        type:'post',
        dataType:'json',
        url:getContextPath+'/catalog/vehicleMaxCount/showdata.do',//请求数据的地址
        success:function(data){
            if(data == null || data.length == 0){
                alert("不存在数据");
                return;
            }
            //alert(data);

            for(var i=0;i<data.length;i++){
                categoriesArr[i] = data[i].innerId;
                seriesMaxSpeed[i] = data[i].maxSpeed;
                seriesMaxMileage[i] = data[i].maxMileage;
                seriesMaxEngineSpeed[i] = data[i].maxEngineSpeed;
                seriesMaxEngineTem[i] = data[i].maxEngineTem;
                seriesMaxEngineLoad[i] = data[i].maxEngineLoad;
            }

        },
        error:function(e){
            alert("error");
        }
    });

    $(document).ready(function() {
        //每隔3秒自动调用方法，实现图表的实时更新
        //window.setInterval(getHighchats,3000);
        window.setTimeout(getHighchats,2000);
    });

});

function getHighchats(){
    $('#container').highcharts({
        chart: {
            type: 'column',
            margin: 75,
            options3d: {
                enabled: true,
                alpha: 10,
                beta: 25,
                depth: 70
            }
        },
        title: {
            text: '车辆参数极大值统计'
        },
        subtitle: {
            text: '统计车辆的最大速度，里程，引擎速度，引擎温度，引擎负载'
        },
        plotOptions: {
            column: {
                depth: 25
            }
        },
        xAxis: {
            categories: categoriesArr
        },
        yAxis: {
            title: {
                text: null
            }
        },
        series: [{
            name: '速度',
            data: seriesMaxSpeed
        }, {
            name: '里程',
            data: seriesMaxMileage

        }, {
            name: '引擎速度',
            data: seriesMaxEngineSpeed

        }, {
            name: '引擎温度',
            data: seriesMaxEngineTem

        }, {
            name: '引擎负载',
            data: seriesMaxEngineLoad
        }]
    });
}