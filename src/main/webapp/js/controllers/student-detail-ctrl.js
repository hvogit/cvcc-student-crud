'use strict';

angular.module('cvccApp')

.controller('studentDetailCtrl', function($scope, $location, $timeout, studentService) {

	var student = $scope.student = studentService.getEditingStudent();
	$scope.editMode = student && student.id;

	$scope.save = function() {
		studentService.save(student)
		.then(function() {
			$scope.saved = true;
			$timeout(function() {
				$location.path('student/list');
			}, 1000);
		});
	};

	$scope.cancel = function() {
		studentService.setEditingStudent();
		$location.path('student/list');
	};

});
