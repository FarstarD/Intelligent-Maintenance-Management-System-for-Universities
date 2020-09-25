###books
- bookID int auto not null      /id
- inputName varchar not null        /提交人姓名
- phone int notnull             /联系人电话
- maintainThing varchar not null    /维修的设备
- sayProblem varchar not null       /描述设备问题
- maintainNum int not null      /维修设备的总数量
- bookAddress varchar not null      /维修设备的地址
- inputTime datetime not null       /提交表单时间
- bookState varchar not null        /表单的状态:未处理,正在处理,已处理
- finishName varchar not null       /维修人姓名
- finishTime datatime not null      /完成维修时间
- sayResult varchar                 /维修员结果描述

###users
- userID int auto not null      /id
- userName varchar not null         /用户姓名
- userLogin varchar not null        /登录账号
- userPwd varchar not null          /登录密码
- userSex varchar not null          /性别
- userJob varchar not null          /职务:(学生,老师)
- userPhone int not null        /用户电话

###repairs
- repairID int auto not null   /id
- repairName varchar not null      /维修人员姓名
- repairLogin varchar not null     /登录账号
- repairPwd varchar not null       /登录密码
- repairSex varchar not null       /性别
- repairJob varchar not null       /职务:(维修人员)
- repairPhone int not null     /维修人员电话

## 用户分页
