package logic.utility;

import logic.card.BaseCard;
import logic.game.GameLogic;

import java.util.ArrayList;

public class GameLogicUtility {

    public static boolean drawRule(){
        ArrayList<BaseCard> temp = GameLogic.getInstance().getHand();
        for(BaseCard card : temp){
            if(card.ruleCheck()){
                return false;
            }
        }
        return true;
    }
}
