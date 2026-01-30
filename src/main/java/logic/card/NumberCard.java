package logic.card;

import logic.game.CardColor;
import logic.game.CardSymbol;
import logic.game.GameLogic;

public class NumberCard extends BaseCard{
    public NumberCard(CardColor color, CardSymbol symbol){
        super(color);
        this.setSymbol(symbol);
    }
    @Override
    public void play(){
        GameLogic.getInstance().setTopCard(this);
    }

    @Override
    public boolean ruleCheck(){
        CardColor topCardColor = GameLogic.getInstance().getTopCard().getColor();
        CardSymbol topCardSymbol = GameLogic.getInstance().getTopCard().getSymbol();
        return this.getColor() == topCardColor || this.getSymbol() == topCardSymbol;
    }
}
