* 根据游戏首页Tab选项卡tag获取游戏
game/hotTag/tagName
返回
返回一个game的list包含相关game的所有数据

* 获取发现页上部分的游戏玩法tag列表
game/playTypeTagList

* 根据发现页获取游戏
playTypeTag/tagName
根据tagName找到tagid,再根据id多表查询获取到对应tagid的game的list

* 根据findtag获取game, findtag是比如每日新发现/安利墙
返回game的list
game/findTag/tagName

