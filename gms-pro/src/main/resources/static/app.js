var app = new Vue({
    el: '#app',
    data: function () {
        return {
            posts: []
        }
    },
    methods: function(){
        var self = this
        return axios.get('http://localhost:8002/portal/indexData')
            .then(function (response) {
                self.posts = response.data.posts
            })
    }
})
