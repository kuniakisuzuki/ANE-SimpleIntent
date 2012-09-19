ANE-SimpleIntent
================

Launch other application in Air for Android.

Usage.
-------------
    import jp.sikisize.SimpleIntent;

    var extension:SimpleIntent = new SimpleIntent();
    
    btn0.addEventListener(MouseEvent.CLICK , _click);
    function _click(e){
        extension.intent("com.google.android.youtube");//Launch Youtube application.
    }