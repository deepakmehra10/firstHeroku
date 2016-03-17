app.controller('NamesCtrl', function($scope) {
    // get names using AngularJS AJAX API  
    $http.get('/getNames').success(function(data){
        $scope.names = data;
    });
});
