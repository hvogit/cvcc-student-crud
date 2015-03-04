'use strict';

angular.module('cvccApp')

.controller('studentListCtrl', function($scope, $location, studentService) {

	studentService.get().then(function(results) {
		$scope.students = results;
	});

	$scope.edit = function(student) {
		studentService.setEditingStudent(student);
		$location.path('student/detail');
	};

	$scope.delete = function(student) {
		studentService.delete(student.id)
			.then(function() {
				removeById($scope.students, student);
			});
	};

	$scope.add = function() {
		var newStudent = {};
		studentService.setEditingStudent(newStudent);
		$location.path('student/detail');
	}

	function removeById(array, item) {
		for (var i = 0; i < array.length; i++) {
			if (array[i].id == item.id) {
				return array.splice(i,1);
			}
		}
	}
});
