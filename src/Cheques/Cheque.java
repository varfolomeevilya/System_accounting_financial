package Cheques;

import Costs.Current_costs;
import Costs.Potential_costs;
import Costs.Potential_income;

public class Cheque {
    private Current_costs current_costs;
    private Potential_costs potential_costs;
    private Potential_income potential_income;
    public Cheque(Current_costs current_costs){
        this.current_costs=current_costs;

    }
    public Cheque(Potential_income potential_income){
        this.potential_income = potential_income;
    }
    public Cheque(Potential_costs potential_costs){
        this.potential_costs = potential_costs;
    }

    @Override
    public String toString() {
        return "Cheque{" +
                "current_costs=" + current_costs +
                ", potential_costs=" + potential_costs +
                ", potential_income=" + potential_income +
                '}';
    }
}
