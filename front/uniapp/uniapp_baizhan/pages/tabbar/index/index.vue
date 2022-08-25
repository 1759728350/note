<template>
	<view class="home">
		<NavBar></NavBar>
		<BannerSwiper></BannerSwiper>
		<CourseNav></CourseNav>
		<Advertisement></Advertisement>
		<view class="free_box">
			<view class="free_T_box public_tow_box">
				<view class="public_T">
					限时免费
				</view>
			</view>
			<FreeCard />
		</view>
		<view>
			<view v-for="(item,index) in userList">
				<div>
					<span>{{item.id}}   </span>
					<span>{{item.name}}   </span>
				</div>
			</view>
		</view>
	</view>
	
</template>

<script>
	import NavBar from '@/components/navbar/navbar.vue'
	import CourseNav from '@/components/coursenav/coursenav.vue'
	import BannerSwiper from '@/components/bannerswiper/bannerswiper.vue'
	import Advertisement from '@/components/advertisement/advertisement.vue'
	export default {
		data() {
			return {
				userList:[]
			}
		},
		components: {
			NavBar,
			CourseNav,
			BannerSwiper,
			Advertisement
		},
		mounted() {
			uni.request({
				url: "http://localhost:8888/uniappbackEnd/user/getUser",
				//不能写success(res){}
				success:(res)=> {
					console.log(res)
					this.userList = res.data.data
				}
			})
		},
		methods: {

		}
	}
</script>

<style lang="scss">
	
</style>
