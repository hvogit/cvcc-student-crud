var gulp = require('gulp'),
		livereload = require('gulp-livereload');

function startExpress() {
	var express = require('express');
	var app = express();
	app.use(express.static('webapp'));
	app.listen(3000, function() {
		console.log('Listening on port 3000\n');
	});
}

gulp.task('default', function() {
	startExpress();
	livereload.listen();
	gulp.watch('webapp/**/*.*').on('change', function(event) {
		console.log('File ' + event.path + ' was ' + event.type + ', reloading ...');
		gulp.src(event.path).pipe(livereload());
	});
});

// notes:
// run 'npm install' to install all dependencies in package.json
// run 'gulp'
