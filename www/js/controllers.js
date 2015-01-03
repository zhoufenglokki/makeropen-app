angular.module('starter.controllers', []).controller('AppCtrl', function($scope, $ionicModal, $timeout) {
	// Form data for the login modal
	$scope.loginData = {};

	// Create the login modal that we will use later
	$ionicModal.fromTemplateUrl('templates/login.html', {
		scope : $scope
	}).then(function(modal) {
		$scope.modal = modal;
	});

	// Triggered in the login modal to close it
	$scope.closeLogin = function() {
		$scope.modal.hide();
	};

	// Open the login modal
	$scope.login = function() {
		$scope.modal.show();
		$scope.loginData.username = window.localStorage['loginForm.nick'] || "";
		if ($scope.loginData.username.length > 0) {
			$scope.loginData.formSaveToken = true;
		}
	};

	// Perform the login action when the user submits the login form
	$scope.doLogin = function() {
		console.log('Doing login', $scope.loginData);
		if ($scope.loginData.formSaveToken && $scope.loginData.username.length > 0) {
			window.localStorage['loginForm.nick'] = $scope.loginData.username;
		}
		if ($scope.loginData.formSaveToken == false) {
			window.localStorage['loginForm.nick'] = "";
		}
		// Simulate a login delay. Remove this and replace with your login
		// code if using a login system
		$timeout(function() {
			$scope.closeLogin();
		}, 1000);
	};

})

.controller('DashCtrl', function($scope) {
})

.controller('TodoCtrl', function($scope, Chats) {
	$scope.chats = Chats.all();
	$scope.remove = function(chat) {
		Chats.remove(chat);
	}
})

.controller('ChatDetailCtrl', function($scope, $stateParams, Chats) {
	$scope.chat = Chats.get($stateParams.chatId);
})

.controller('HangoutCtrl', function($scope, $http, HangoutManager) {

	$scope.$on("$ionicView.afterEnter", function() {
		HangoutManager.queryHangoutByCity($scope, $http);
	});
})

.controller('FriendDetailCtrl', function($scope, $stateParams, Friends) {
	$scope.friend = Friends.get($stateParams.friendId);
})

.controller('AccountCtrl', function($scope) {
	$scope.settings = {
		enableFriends : true
	};
	$scope.$on("$ionicView.afterEnter", function() {
		$scope.login();
	});
});
