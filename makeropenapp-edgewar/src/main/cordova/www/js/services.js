angular
		.module('starter.services', [])
		.factory('GlobalSetting', function() {
			var localServerUrl = "http://localhost:8080/edgewar";
			var testServerUrl = "http://192.168.2.210:8080/edgewar";
			var productionServerUrl = "http://localhost:8100/edgewar";
			var serverUrl = productionServerUrl;
			return {
				getServerUrl : function() {
					return serverUrl;
				},
				setupServerUrlWithLocal : function() {
					serverUrl = localServerUrl;
				},
				setupServerUrlWithTest : function() {
					serverUrl = testServerUrl;
				},
				setupServerUrlWithProduction : function() {
					serverUrl = productionServerUrl;
				}
			}
		})

		.factory(
				'Chats',
				function() {
					var chats = [
							{
								id : 0,
								name : 'Ben Sparrow',
								lastText : 'You on your way?',
								face : 'https://pbs.twimg.com/profile_images/514549811765211136/9SgAuHeY.png'
							},
							{
								id : 1,
								name : 'Max Lynx',
								lastText : 'Hey, it\'s me',
								face : 'https://pbs.twimg.com/profile_images/479740132258361344/KaYdH9hE.jpeg'
							},
							{
								id : 2,
								name : 'Andrew Jostlin',
								lastText : 'Did you get the ice cream?',
								face : 'https://pbs.twimg.com/profile_images/491274378181488640/Tti0fFVJ.jpeg'
							},
							{
								id : 3,
								name : 'Adam Bradleyson',
								lastText : 'I should buy a boat',
								face : 'https://pbs.twimg.com/profile_images/479090794058379264/84TKj_qa.jpeg'
							},
							{
								id : 4,
								name : 'Perry Governor',
								lastText : 'Look at my mukluks!',
								face : 'https://pbs.twimg.com/profile_images/491995398135767040/ie2Z_V6e.jpeg'
							} ];

					return {
						all : function() {
							return chats;
						},
						remove : function(chat) {
							chats.splice(chats.indexOf(chat), 1);
						},
						get : function(chatId) {
							for (var i = 0; i < chats.length; i++) {
								if (chats[i].id === parseInt(chatId)) {
									return chats[i];
								}
							}
							return null;
						}
					}
				})

		.factory(
				'HangoutManager',
				[
						'$http',
						'GlobalSetting',
						function($http, GlobalSetting) {

							return {
								queryHangoutByCity : function() {
									var req = {
										method : 'POST',
										url : GlobalSetting.getServerUrl()
												+ "/queryHangoutByCity.json",
										headers : {
											'Content-Type' : 'application/json'
										}
									};

									return $http(req).error(function(data, status, headers, config){
										console.log('error:HangoutManager.queryHangoutByCity()--' + config.url);
									});
								}
							}
						} ]
);
