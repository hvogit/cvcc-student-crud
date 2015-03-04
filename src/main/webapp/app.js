'use strict';

angular.module('cvccApp', ['ngRoute'])
.constant('Configs', {
	API_URL: 'http://localhost:8080/api'
})
.config(['$routeProvider', function($routeProvider) {
	$routeProvider
		.when('/student/list', { templateUrl: 'views/student-list.html' })
		.when('/student/detail', { templateUrl: 'views/student-detail.html' })
		.otherwise({redirectTo: '/student/list'});
}])

;
