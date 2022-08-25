<template>
	<view class="course_nav_con">
		<view class="course_nav_info" v-for="(item,index) in list" :key="index">
														<!-- 动态绑定class -->
			<text class="course_nav_icon icon iconfont" :class="item.icon"></text>
			<view class="course_info_text">{{ item.text }}</view>
		</view>
		
	</view>
</template>

<script>
	export default {
		data() {
			return {
				list:[]
			}
		},
		mounted() {
			uni.request({
				url:"http://html5.bjsxt.cn/api/index/nav",
				success: (res) => {
					console.log(res)
					this.list = res.data.data
				}
			})
		},
		methods: {
			
		}
	}
</script>

<style lang="scss">
	//引入common文件夹里字体的css文件
	@import "@/common/font/iconfont.css";
	
	.course_nav_con{
		display: flex;
		//解决盒子空隙和盒子本身问题,灵活控制总长宽与容器长宽相同
		box-sizing: border-box;
		//横向,从左往右排列
		flex-direction: row;
		//一行排满,自动换行
		flex-wrap: wrap;
		//上下  左右
		padding: 15px 10px;
		.course_nav_info{
			//一行五个图标
			width: 20%;
			flex-direction: row;
			flex-wrap: wrap;
			text-align: center;
			margin-bottom: 15px;
			
			.course_nav_icon{
				font-size: 30px;
			}
			.course_info_text{
				width: 100%;
				margin-top: 10px;
				
				//文本超出用点点点代替
				text-overflow: ellipsis;
				
				//超出容器隐藏
				overflow: hidden;
				//超出容器隐藏
				white-space: nowrap;
			}
			.icon-java {
				color: #2a83fe;
			}
			
			.icon-weifuwu {
				color: #fd3761;
			}
			
			.icon-zuzhijiagou {
				color: #2b91e2;
			}
			
			.icon-dashuju {
				color: #2a83fe;
			}
			.icon-zidonghua{
				color: #2b91e2;
			}
			
			.icon-h {
				color: #00b478;
			}
			
			.icon-icon-- {
				color: #fd6012;
			}
			
			.icon-rengongzhineng {
				color: #fe391f;
			}
			
			.icon-ruanjianceshi {
				color: #00b478;
			}
			
			.icon-huatong {
				color: #fea917;
			}
			
			.icon-bianchengshibaobiao_icon {
				color: #2a83fe;
			}
			
			.icon-jianmo {
				color: #00b478;
			}
			
			.icon-chuangye {
				color: #fe391f;
			}
			
		}
		
	}
	
	
</style>
