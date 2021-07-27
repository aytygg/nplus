const service = function(){

    let contents = function(){

        new Vue({
            el: '#app',
            data: {
                message: '안녕하세요 Vue!'
            }
        });

    };

    return{
        init : function(){
            contents();
        }
    }

}();

window.onload = function(){
    service.init();
    console.log(store.state.count);
};

