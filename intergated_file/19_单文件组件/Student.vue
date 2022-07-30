<template>
    <!-- 组件的结构 -->
    <!-- <template></template>标签最终是不参与编译的 -->
    <div>
        <h2>学生姓名：{{name}}</h2>
        <h2>学生年龄：{{age}}</h2>
        <button @click="popup">点我弹窗</button>
    </div>
</template>

<script>
// 组件交互相关的代码（数据、方法等等）
    Vue.Vue.config.productionTip = false;
    export default {
        name:"Student",
            data() {
                return {
                    name:"张凡",
                    age:18
                }
            },
            methods: {
                popup(){
                    alert(this.name);
                }
            },
    }


</script>

<style>
/*  组件样式*/
</style>
