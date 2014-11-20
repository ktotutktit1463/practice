package com.example.android.BluetoothChat;

import java.io.Serializable;

public class Picture implements Serializable {
	/**
	 *
	 */
	public byte[] b;//画像とバイトデータを格納する
	public String touchEV = "touchEvent";//タッチされてた座標値をメッセージとして送る
	public int flag = 0;//画像を送るのか、座標値を送るのかのフラグ

}
