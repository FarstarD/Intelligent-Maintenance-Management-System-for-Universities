$(document).ready(function() {
    // 点击菜单按钮 toggle() 方法切换元素的可见状态
    $('#showButtom').click(function(e) {
        $('#Myenum').css({
                width: '70%'
            })
            // 拦截事件，让下面的点击事件收不到事件。
        e.stopPropagation()
    })

    // 所有点击都默认为隐藏
    $(document).click(function() {
        //$('#Myenum').hide()
        $('#Myenum').css({
            width: '0'
        })
    })

    // 点击无效区域,点击了这块会把上面那个隐藏抵消掉
    $('#Myenum').click(function(e) {
        e.stopPropagation()
    })
})