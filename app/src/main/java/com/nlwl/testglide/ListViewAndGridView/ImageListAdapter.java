package com.nlwl.testglide.ListViewAndGridView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.nlwl.testglide.R;

/**
 * Created by Administrator on 2017-10-31.
 */

public class ImageListAdapter extends ArrayAdapter {
	private Context context;
	private LayoutInflater inflater;

	private String[] imageUrls;

	public ImageListAdapter(Context context, String[] imageUrls) {
		super(context, R.layout.listview_item_image, imageUrls);

		this.context = context;
		this.imageUrls = imageUrls;

		inflater = LayoutInflater.from(context);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (null == convertView) {
			convertView = inflater.inflate(R.layout.listview_item_image, parent, false);
		}

		TextView textView = (TextView) convertView.findViewById(R.id.tv_position);
		textView.setText(position+"");

		ImageView imageView = (ImageView) convertView.findViewById(R.id.iv_bitmap);

		Glide.with(context)
				.load(imageUrls[position])
				.into(imageView);

		return convertView;
	}
}
