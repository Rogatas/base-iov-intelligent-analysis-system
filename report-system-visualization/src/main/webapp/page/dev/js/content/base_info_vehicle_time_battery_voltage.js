var ranges = new Array();
var averages = new Array();


$(function ()
{
    $.ajax({
        type:'post',
        dataType:'json',
        url:getContextPath+'/catalog/baseInfoVehicleTime/showdata/batteryVoltage.do',//请求数据的地址
        success:function(data){
            if(data == null || data.length == 0){
                alert("不存在数据");
                return;
            }

            //迭代，把异步获取的数据放到数组中
            $.each(data,function(i,d){
                averages.push([d.storageTime,d.averageBatteryVoltage]);
                ranges.push([d.storageTime,d.minBatteryVoltage,d.maxBatteryVoltage]);
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


    $('#container').highcharts({

        title: {
            text: '每日电瓶电压范围统计'
        },

        xAxis: {
            type: 'datetime'
        },

        yAxis: {
            title: {
                text: null
            }
        },

        tooltip: {
            crosshairs: true,
            shared: true,
            valueSuffix: 'V'
        },

        legend: {
        },

        series: [{
            name: '平均电瓶电压',
            data: averages,
            zIndex: 1,
            marker: {
                fillColor: 'white',
                lineWidth: 2,
                lineColor: Highcharts.getOptions().colors[0]
            }
        }, {
            name: '电瓶电压范围',
            data: ranges,
            type: 'arearange',
            lineWidth: 0,
            linkedTo: ':previous',
            color: Highcharts.getOptions().colors[0],
            fillOpacity: 0.3,
            zIndex: 0
        }]
    });

}

