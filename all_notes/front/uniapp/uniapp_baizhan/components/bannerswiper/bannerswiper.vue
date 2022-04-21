<template>
	<view class="index_banner_box">
		<swiper class="swiper":indicator-dots="true" :autoplay="true" :interval="3000" :duration="1000">
			<swiper-item  v-for="(item,index) in topBanner" :key="index">
				<image class="banner" :src="item.img_url"></image>
			</swiper-item>
			
		</swiper>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				topBanner:[]
			}
		},
		mounted() {
			uni.request({
				url: "http://html5.bjsxt.cn/api/index/banner",
				//不能写success(res){}
				success:(res)=> {
					// console.log(res)
					this.topBanner = res.data.top_banner
				}
			})
		},
		methods: {
			
		}
	}
</script>

<style lang="scss">
	.home{
		//使其子元素弹性排列
		display: flex;
		//垂直排列
		flex-direction: column;
		//一个充满全屏
		/* flex:1;表示该盒子自动占满剩余空间（往下展开） */
		flex:1;
		//内容超出部分隐藏掉
		overflow: hidden;
		
		.index_banner_box{
			// flex:1;
			display: flex;
			width: 100%;
			padding: 10px;
			//水平居中
			justify-content: center;
			//垂直居中
			align-items: center;
			//圆角效果
			border-radius: 5px;
			overflow: hidden;
			.swiper{
				width: 100%;
				height: 260rpx;
				.banner{
					width: 700rpx;
					height: 260rpx;
				}
			}
			
		}
	}
</style>