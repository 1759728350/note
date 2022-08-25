<template>
	<view class="online_box">
		<image :src="index_banner.img_url" class="online_img"></image>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				topBanner: [],
				index_banner:{},
				fontBanner:{}
			}
		},
		mounted() {
			uni.request({
				url:"http://html5.bjsxt.cn/api/index/banner",
				success: (res) => {
					
					this.topBanner = res.data.top_banner
					this.index_banner = res.data.index_banner
					this.fontBanner = res.data.foot_banner
				}
			})
		},
		methods: {
			
		}
	}
</script>

<style lang="scss">
	.online_box{
		display: flex;
		width: 724rpx;
		justify-content: center;
		align-items: center;
		overflow: hidden;
		box-sizing: border-box;
		margin-bottom: 15px;
		.online_img{
			width: 724rpx;
			height: 132rpx;
		}
	}
</style>
