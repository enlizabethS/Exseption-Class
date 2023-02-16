public class Girl {
    String name;
    Double promile = 0.0;
    Boolean hasMaceUp;
    Boolean hasPrettyDress;

    public Girl(String name) {
        this.name = name;
        hasMaceUp =false;
        hasPrettyDress = false;
    }
    public void drink (){
        promile += 0.5;
    }
    public void makeUp(){
        hasMaceUp = true;
    }
    public void dressPerfect(){
        hasPrettyDress = true;
    }
    public void haveFun() throws FridayNightException {
        if(promile > 1 && hasMaceUp && hasPrettyDress){
            System.out.println("Эгегей! Я в жопу пьяная, " +
                    "но чертовски хороша!");
        }  else {
            throw new FridayNightException(
                    "Ошибка, потому что... " + promile + " "+ hasMaceUp + " "+ hasPrettyDress
            );
        }
    }

    @Override
    public String toString() {
        return  name + "\n" +
                "Promile:" + promile +
                "HasMaceUp:" + hasMaceUp +
                "HasPrettyDress:" + hasPrettyDress ;
    }

}
