package javaders.day38enumsiterators;

public class EnumRunner {

    public static void main(String[] args) {
      //  Enumdaki datayi get methodu olmadan kullanirsak data tipini enum ismi yapalim

        String capitalOfIllınous=UsStatesEnum.ILLINOIS.getCapital();

        System.out.println(capitalOfIllınous);


        String abbreviationOfFlorida=UsStatesEnum.FLORIDA.getAbbreviation();
        System.out.println(abbreviationOfFlorida);

        UsStatesEnum state=UsStatesEnum.ALASKA;

        System.out.println(state);


        String stateName=UsStatesEnum.getStateNameByUsingAbrreviation("AK");
        System.out.println(stateName);

       String abbreviationOfAlaska= UsStatesEnum.getAbbreviationForStateName("Alaska");
        System.out.println(abbreviationOfAlaska);


    }
}
