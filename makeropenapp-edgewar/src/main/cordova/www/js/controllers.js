angular.module('starter.controllers', []).controller('AppCtrl', function($scope, $ionicModal) {
	// Form data for the login modal
	$scope.loginData = {};

	$ionicModal.fromTemplateUrl('templates/login.html', {
		scope : $scope
	}).then(function(loginModal) {
		$scope.loginModal = loginModal;
	});

	$scope.closeLogin = function() {
		$scope.loginModal.hide();
	};

	$scope.login = function() {
		$scope.loginModal.show();
		$scope.loginData.username = window.localStorage['loginForm.nick'] || "";
		if ($scope.loginData.username.length > 0) {
			$scope.loginData.formSaveToken = true;
		}
	};

	$scope.doLogin = function() {
		console.log('Doing login', $scope.loginData);
		if ($scope.loginData.formSaveToken && $scope.loginData.username.length > 0) {
			window.localStorage['loginForm.nick'] = $scope.loginData.username;
		}
		if ($scope.loginData.formSaveToken == false) {
			window.localStorage['loginForm.nick'] = "";
		}
		
		$scope.closeLogin();
	};

	$scope.resetPswStep1 = function() {
	$ionicModal.fromTemplateUrl('templates/resetPswStep1.html', {
		scope : $scope
	}).then(function(resetPswStepModal) {
		$scope.resetPswStepModal = resetPswStepModal;
		resetPswStepModal.show();
	})
	};

	$scope.closeResetPswModal = function() {
		$scope.resetPswStepModal.hide();
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
