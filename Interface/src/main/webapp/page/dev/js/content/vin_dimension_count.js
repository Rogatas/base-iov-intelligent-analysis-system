var categoriesArr = new Array();
var seriesPv = new Array();
var seriesUvCountry = new Array();
var seriesUvOem = new Array();
var seriesUvYear = new Array();
$(function () {

    //alert(data);

    $.ajax({
        type:'post',
        dataType:'json',
        url:getContextPath+'/catalog/showdata.do',//请求数据的地址
        success:function(data){
            if(data == null || data.length == 0){
                alert("不存在数据");
                return;
            }
            //alert(data);

            for(var i=0;i<data.length;i++){
                categoriesArr[i] = data[i].province;
                seriesPv[i] = data[i].pv;
                seriesUvCountry[i] = data[i].uvCountry;
                seriesUvOem[i] = data[i].uvOem;
                seriesUvYear[i] = data[i].uvYear;
            }

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

function getHighchats() {
    $('#container').highcharts({
        chart: {
            type: 'column'
        },
        title: {
            text: '基于不同省份车辆VIN码的各维度统计'
        },
        subtitle: {
            text: '从生产年份，生产国家以及品牌等多个维度进行统计分析'
        },
        xAxis: {
            categories: categoriesArr,
            crosshair: true
        },
        yAxis: {
            min: 0,
            title: {
                text: '车 辆 数'
            }
        },
        tooltip: {
            headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
            pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
            '<td style="padding:0"><b>{point.y:.1f}</b></td></tr>',
            footerFormat: '</table>',
            shared: true,
            useHTML: true
        },
        plotOptions: {
            column: {
                pointPadding: 0.2,
                borderWidth: 0
            }
        },
        series: [{
            name: 'pv',
            data: seriesPv

        }, {
            name: 'uv_country',
            data: seriesUvCountry

        }, {
            name: 'uv_oem',
            data: seriesUvOem

        }, {
            name: 'uv_year',
            data: seriesUvYear

        }]
    });
}