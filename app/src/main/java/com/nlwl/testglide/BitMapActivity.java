package com.nlwl.testglide;

import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.io.File;

/**
 * 测试加载一张网络图片，一个视频，从项目资源中加载一张图片，从文件中加载一张图片，从Uri中加载一张图片
 */
public class BitMapActivity extends AppCompatActivity {

	ImageView imageView;
	String url;//  加载一张图片

	String filePath;//  加载一个视频

	int resid;//  资源中加载一张图片

	File file;// 从文件中加载一张图片

	Uri uri;// 从Uri加载


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bit_map);

		initView();

		initData();

	}

	private void initData() {

//		Glide.with(this)
////				.load(url)//  加载一张url图片
////				.load("")//  加载一个视频
//				.load(resid)   //  安卓项目资源中加载一张图片
//				.override(150,150)   //  给图片设置宽高，，设置不成功
//				.placeholder(R.mipmap.ic_launcher) // 加载过程中图片未能及时显示，此时可能需要设置等待时的图片，通过placeHolder()方法：
//				.error(R.drawable.aaa) // 加载图片失败时，通过error(Drawable drawable)方法设置加载失败后的图片显示
//				.into(imageView);


		//  从文件中加载一张图片
//		Glide.with(this)
//				.load(file)
//				.into(imageView);


		//  从Uri加载
		Glide.with(this)
				.load(uri)
				.into(imageView);


	}

	private void initView() {
		imageView = (ImageView) findViewById(R.id.Glide_ImageView);
//		url = "http://cloud.yearring.com//addPeiJianFile/fc40901b-ef6c-4cb8-b64e-94caf6a39cc5/1509396757485.jpg.png.png";
//		filePath = "/storage/emulated/0/Pictures/example_video.mp4";
//
//		resid = R.drawable.bbb;
//
//		file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Screenshot_2017-10-30-13-46-21.png");

		uri= resourceIdToUri(this, R.drawable.ccc);
	}

	/**
	 * 将资源id转换为一个Uri
	 */
	public static final String ANDROID_RESOURCE = "android.resource://";
	public static final String FOREWARD_SLASH = "/";

	private static Uri resourceIdToUri(Context context, int resourceId) {
		return Uri.parse(ANDROID_RESOURCE + context.getPackageName() + FOREWARD_SLASH + resourceId);
	}

}
