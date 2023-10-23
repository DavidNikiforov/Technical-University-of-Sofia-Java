package FactoryMethodPattern;

class DomesticPlan extends Plan{

    @Override
    public void getRate() {
        rate = 3.5;
    }
}
