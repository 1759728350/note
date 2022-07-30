<template>
    <!-- 组件的结构 -->
    <!-- <template></template>标签最终是不参与编译的 -->
    <div class="demo">
        <h2>学校名称：{{schoolName}}</h2>
        <h2>学校地址：{{schoolAddress}}</h2>
        <button @click="popup">点我弹窗</button>
    </div>
</template>

<script>
// 组件交互相关的代码（数据、方法等等）
    Vue.Vue.config.productionTip = false;
    const School = Vue.extend({
            data() {
                return {
                    schoolName:"华南理工大学",
                    schoolAddress:"广州番禺大学城校区" 
                }
            },
            methods: {
                popup(){
                    alert(this.schoolName);
                }
            },
    })

    export default School


// 简写形式
    //  export default {
    //      name:"School",
    //         data() {
    //             return {
    //                 schoolName:"华南理工大学",
    //                 schoolAddress:"广州番禺大学城校区" 
    //             }
    //         },
    //         methods: {
    //             popup(){
    //                 alert(this.schoolName);
    //             }
    //         },
    // }

</script>

<style>
/*  组件样式*/
    .demo{
        background-color: orange;
    }
</style>
