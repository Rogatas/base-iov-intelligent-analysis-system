
VIN码


create external table code_plate_vin(
code_id string comment '识别号',
plate string comment '车牌号',
vin string comment 'VIN码'
)
row format delimited fields terminated by '\t'
lines terminated by '\n' stored as textfile
location '/liguodong/data/';



---------------------

即时参数

create external table obd_immediate_info(
inner_id string comment '内部ID',
average_speed int comment '平均速度',
min_speed int comment '最小速度',
max_speed int comment '最大速度',
current_speed int comment '当前速度',
current_mileage int comment '当前里程(前一次打火时间到当前里程数)',
all_mileage int comment '总里程',
current_engine_speed string comment '当前引擎转速',
current_engine_tem int comment '当前引擎温度',
last_max_speed string comment '前一次时间段至此引擎最大转速',
last_min_speed string comment '前一次时间段至此引擎最小转速',
last_average_speed string comment '前一次时间段至此引擎平均转速',
engine_load string comment '引擎负荷',
storage_time string comment '入库时间'
)
row format delimited fields terminated by '\t'
lines terminated by '\n' stored as textfile
location '/output/ObdImmediateParameters/';




--------------

综合参数

create external table obd_general_parameters(
inner_id string comment '内部ID',
average_oil_wear double comment '平均油耗',
min_oil_wear double comment '最小油耗',
max_oil_wear double comment '最大油耗',
innage double comment '剩余油量',
current_intake_tem int comment '当前进气温度',
average_intake_tem int comment '平均进气温度',
min_intake_tem int comment '最小进气温度',
max_intake_tem int comment '最大进气温度',
current_air_flow int comment '当前空气流量',
average_air_flow int comment '平均空气流量',
min_air_flow int comment '最小空气流量',
max_air_flow int comment '最大空气流量',
current_battery_voltage double comment '当前电瓶电压',
average_battery_voltage double comment '平均电瓶电压',
min_battery_voltage double comment '最小电瓶电压',
max_battery_voltage double comment '最大电瓶电压',
current_coolant_tem int comment '当前冷却液水温',
average_coolant_tem int comment '平均冷却液水温',
min_coolant_tem int comment '最小冷却液水温',
max_coolant_tem int comment '最大冷却液水温',
current_steam_pressure int comment '当前蒸汽压力',
average_steam_pressure int comment '平均蒸汽压力',
min_steam_pressure int comment '最小蒸汽压力',
max_steam_pressure int comment '最大蒸汽压力',
storage_time string comment '入库时间'
)
row format delimited fields terminated by '\t'
lines terminated by '\n' stored as textfile
location '/output/ObdGeneralParameters/';





