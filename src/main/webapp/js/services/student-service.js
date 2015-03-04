angular.module('cvccApp')
.service('studentService', ['$http', '$q', 'Configs', function($http, $q, Configs){
	var url = Configs.API_URL + '/students/';
	var editingStudent;

	this.get = function() {
		var d = $q.defer();
		$http.get(url)
		.success(function(response) {
			d.resolve(response);
		})
		.error(function(data, status, headers, config) {
			d.reject('failed to get students');
		});
		return d.promise;
	};

	this.save = function(student) {
		var d = $q.defer();
		$http.post(url, student)
		.success(function(response) {
			d.resolve(response);
		})
		.error(function(data, status, headers, config) {
			d.reject('failed to post student');
		});
		return d.promise;
	};

	this.delete = function(id) {
		return $http.delete(url + id);
	};

	this.setEditingStudent = function(student) {
		editingStudent = student;
	};
	this.getEditingStudent = function() {
		return editingStudent;
	};

}]);
