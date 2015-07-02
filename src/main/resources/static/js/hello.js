angular.module('hello', [])
    .controller('home', function($scope, $http) {
        $scope.addPerson = function(){
            $http.post('/add/person', $scope.personDTO).success(function(response) {
                console.log(response);
            }).error(function() {
            });
        }
    })