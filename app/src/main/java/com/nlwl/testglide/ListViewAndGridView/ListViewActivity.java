package com.nlwl.testglide.ListViewAndGridView;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.ListView;

import com.nlwl.testglide.R;

/**
 * 测试Glide在Listview和Gridview中的使用
 */
public class ListViewActivity extends AppCompatActivity {

	ListView listView;
	GridView gridView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_view);

//		listView = (ListView) findViewById(R.id.listview);
		gridView = (GridView) findViewById(R.id.gridview);

//		listView.setAdapter(new ImageListAdapter(ListViewActivity.this, eatFoodyImages));
		gridView.setAdapter(new ImageListAdapter(ListViewActivity.this, eatFoodyImages));

	}

	public static String[] eatFoodyImages = {
			"http://pic.qiantucdn.com/58pic/27/72/26/62S58PICh3P.jpg!/fw/290/compress/true/clip/290x386a0a0",
			"http://pic.qiantucdn.com/58pic/27/72/26/65658PICnPa.jpg!/fw/290/compress/true/clip/290x386a0a0",
			"http://pic.qiantucdn.com/58pic/27/72/28/26Q58PICjCp.jpg!/fw/290/compress/true/clip/290x386a0a0",
			"http://pic.qiantucdn.com/58pic/27/72/28/28x58PIC9ME.jpg!/fw/290/compress/true/clip/290x386a0a0",
			"http://pic.qiantucdn.com/58pic/27/72/28/29258PICIJ6.jpg!/fw/290/compress/true/clip/290x386a0a0",
			"http://pic.qiantucdn.com/58pic/27/72/31/04M58PICi4r.jpg!/fw/290/compress/true/clip/290x386a0a0",
			"http://pic.qiantucdn.com/58pic/27/72/47/98s58PICYyk.jpg!/fw/290/compress/true/clip/290x386a0a0",
			"http://pic.qiantucdn.com/58pic/27/72/48/00M58PICTNk.jpg!/fw/290/compress/true/clip/290x386a0a0",
			"http://pic.qiantucdn.com/58pic/27/72/55/56P58PICK9D.jpg!/fw/290/compress/true/clip/290x386a0a0",
			"http://pic.qiantucdn.com/58pic/27/72/58/44n58PICtXf.jpg!/fw/290/compress/true/clip/290x386a0a0",
			"http://pic.qiantucdn.com/58pic/27/73/40/86Y58PICvnV.jpg!/fw/290/compress/true/clip/290x386a0a0",
			"http://pic.qiantucdn.com/58pic/27/73/48/26K58PICDUd.jpg!/fw/290/compress/true/clip/290x386a0a0",
			"http://pic.qiantucdn.com/58pic/27/73/54/93s58PICSEv.jpg!/fw/290/compress/true/clip/290x386a0a0",
			"http://pic.qiantucdn.com/58pic/27/73/68/65A58PICV7C.jpg!/fw/290/compress/true/clip/290x386a0a0",
	};


}
