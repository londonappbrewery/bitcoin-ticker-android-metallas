package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Piotr on 2017-09-20.
 */

public class BitcoinDataModel {

    private String mFirstPieceOfText;

    public static BitcoinDataModel fromJson (JSONObject jsonObject){

        try {
            BitcoinDataModel bitcoinDataModel = new BitcoinDataModel();
            bitcoinDataModel.mFirstPieceOfText = jsonObject.getString("ask");
            return bitcoinDataModel;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
    public String getAnswer(){
        return mFirstPieceOfText;
    }


}
