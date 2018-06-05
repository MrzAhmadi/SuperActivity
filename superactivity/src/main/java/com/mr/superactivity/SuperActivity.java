package com.mr.superactivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.squareup.picasso.Picasso;

import java.net.InetAddress;
import java.util.ArrayList;

public class SuperActivity extends AppCompatActivity {



    ///////////////////////        Toast        ///////////////////////


    public void toast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void toast(String message,int length){
        Toast.makeText(this, message, length ).show();
    }



    ///////////////////////         Log        ///////////////////////


    public void log(String message){
        Log.v("Log",message);
    }

    public void log(String tag,String message){
        Log.v(tag,message);
    }

    public void logTest(){
        Log.v("TestTestTestTestTestTes","TestTestTestTestTestTes") ;
    }


    public void logV(String message){
        Log.v("Log",message);
    }

    public void logV(String tag,String message){
        Log.v(tag,message);
    }

    public void logVTest(){
        Log.v("TestTestTestTestTestTes","TestTestTestTestTestTes") ;
    }

    public void logE(String message){
        Log.e("Log",message);
    }

    public void logE(String tag,String message){
        Log.e(tag,message);
    }

    public void logETest(){
            Log.e("TestTestTestTestTestTes","TestTestTestTestTestTes") ;
    }

    public void logD(String message){
        Log.d("Log",message);
    }

    public void logD(String tag,String message){
        Log.d(tag,message);
    }

    public void logDTest(){
        Log.d("TestTestTestTestTestTes","TestTestTestTestTestTes") ;
    }


    public void logI(String message){
        Log.i("Log",message);
    }

    public void logI(String tag,String message){
        Log.i(tag,message);
    }

    public void logITest(){
        Log.i("TestTestTestTestTestTes","TestTestTestTestTestTes") ;
    }

    public void logW(String message){
        Log.w("Log",message);
    }

    public void logW(String tag,String message){
        Log.w(tag,message);
    }

    public void logWTest(){
        Log.w("TestTestTestTestTestTes","TestTestTestTestTestTes") ;
    }




    ///////////////////////         Network        ///////////////////////

    public boolean isInternetAvailable() {
        try {
            InetAddress ipAddr = InetAddress.getByName("google.com");
            //You can replace it with your name
            return !ipAddr.equals("");

        } catch (Exception e) {
            return false;
        }
    }



    ///////////////////////         Shared Preferences        ///////////////////////

    public static final String PREF_NAME = "ENUMERATOR_PREFERENCES";
    public static final int MODE = Context.MODE_PRIVATE;


    public void prefWriteBoolean(Context context, String key, boolean value) {
        getEditor(context).putBoolean(key, value).commit();
    }

    public boolean prefReadBoolean(Context context, String key,boolean defValue) {
        return getPreferences(context).getBoolean(key, defValue);
    }

    public void prefWriteInteger(Context context, String key, int value) {
        getEditor(context).putInt(key, value).commit();

    }

    public int prefReadInteger(Context context, String key, int defValue) {
        return getPreferences(context).getInt(key, defValue);
    }

    public void prefWriteString(Context context, String key, String value) {
        getEditor(context).putString(key, value).commit();

    }

    public String prefReadString(Context context, String key, String defValue) {
        return getPreferences(context).getString(key, defValue);
    }

    public void prefWriteLong(Context context, String key, long value) {
        getEditor(context).putLong(key, value).commit();
    }

    public long prefReadLong(Context context, String key, long defValue) {
        return getPreferences(context).getLong(key, defValue);
    }

    public SharedPreferences getPreferences(Context context) {
        return context.getSharedPreferences(PREF_NAME, MODE);
    }

    public SharedPreferences.Editor getEditor(Context context) {
        return getPreferences(context).edit();
    }

    public boolean prefExist(Context context,String key){
        return getPreferences(context).contains(key);
    }
    public void prefDelete(Context context,String key){
        getPreferences(context).edit().remove(key).apply();
    }


    ///////////////////////        Fonts       ///////////////////////

    public static void setFont (Context context, TextView view, String font){
        Typeface type = Typeface.createFromAsset(context.getAssets(),"fonts/"+font);
        view.setTypeface(type);
    }

    public static void setFont(Context context, ArrayList<TextView> views, String font){
        Typeface type = Typeface.createFromAsset(context.getAssets(),"fonts/"+font);
        for(int i = 0 ; i<views.size() ; i++){
            views.get(i).setTypeface(type);
        }
    }




    ///////////////////////         YoYo Animation       ///////////////////////



    public  void animate(View view, Techniques techniques){

        YoYo.with(techniques).duration(1000).playOn(view);
    }

    public  void animate(View view, Techniques techniques, int duration){

        YoYo.with(techniques).duration(duration).playOn(view);
    }

    public  void animate(View view,Techniques techniques,YoYo.AnimatorCallback callback){

        YoYo.with(techniques).duration(1000).onEnd(callback).playOn(view);

    }


    public  void animate(View view,Techniques techniques,int duration,YoYo.AnimatorCallback
            callback){

        YoYo.with(techniques).duration(duration).onEnd(callback).playOn(view);

    }





    ///////////////////////        Picasso       ///////////////////////


    public void picasso(String url , ImageView target){
        Picasso.get().load(url).into(target);
    }





}
