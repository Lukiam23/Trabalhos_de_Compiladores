import interpreter_package.*;

public class Interpreter {
    public static void main(String[] args){
        Stm prog = 
        new CompoundStm(
            new AssignStm("a", new OpExp(new NumExp(5), OpExp.Plus, new NumExp(3))),
            new CompoundStm(
                new AssignStm("b", new EseqExp(new PrintStm(new PairExpList(new IdExp("a"), new LastExpList(new OpExp(new IdExp("a"), OpExp.Minus,new NumExp(1))))), new OpExp(new NumExp(10), OpExp.Times, new IdExp("a")))),
                new PrintStm(new LastExpList(new IdExp("b")))
            )
        );
        
        System.out.println("\nProgram: \n");
        CompoundStm arvore = (CompoundStm) prog;
        
        //Subárvore 1
        AssignStm sub_tree_1 = (AssignStm) arvore.stm1;

        System.out.println("Subárvore 1 ID: " + sub_tree_1.id);
        
        //Expressão Subárvore 1
        OpExp exp1 = (OpExp) sub_tree_1.exp;
        
        NumExp exp1_left = (NumExp) exp1.left;
        System.out.println("Subárvore 1 Valor do numero esquerdo: " + exp1_left.num);
        
        System.out.println("Subárvore 1 Valor do operador: " + exp1.oper);
        
        NumExp exp1_right = (NumExp) exp1.right;
        System.out.println("Subárvore 1 Valor do numero direito: " + exp1_right.num);

        //Subárvore 2
        CompoundStm sub_tree_2 = (CompoundStm) arvore.stm2;
        
        AssignStm sub_tree_2_1 = (AssignStm) sub_tree_2.stm1;
        
        System.out.println("Subárvore 2 - Subárvore 1 ID: " + sub_tree_2_1.id);
    
        EseqExp sub_tree_2_1_exp = (EseqExp) sub_tree_2_1.exp;
        PrintStm sub_tree_2_1_exp_stm = (PrintStm) sub_tree_2_1_exp.stm;
        
        PairExpList sub_tree_2_1_exp_stm_exp_list = (PairExpList) sub_tree_2_1_exp_stm.exps;
        IdExp sub_tree_2_1_exp_stm_exp_list_head = (IdExp) sub_tree_2_1_exp_stm_exp_list.head;
        System.out.println("Subárvore 2 - Subárvore 1 - ID do primeiro valor: " + sub_tree_2_1_exp_stm_exp_list_head.id);

        LastExpList sub_tree_2_1_exp_stm_exp_list_tail = (LastExpList) sub_tree_2_1_exp_stm_exp_list.tail;
        
        OpExp sub_tree_2_1_exp_stm_exp_list_tail_opexp = (OpExp) sub_tree_2_1_exp_stm_exp_list_tail.head;
        
        IdExp sub_tree_2_1_exp_stm_exp_list_tail_opexp_left = (IdExp) sub_tree_2_1_exp_stm_exp_list_tail_opexp.left;
        System.out.println("Subárvore 2 - Subárvore 1 - Segunda expressão do valor - ID do número esquerdo : " + sub_tree_2_1_exp_stm_exp_list_tail_opexp_left.id);
        
        System.out.println("Subárvore 2 - Subárvore 1 - Segunda expressão do valor - Valor do Operador: " + sub_tree_2_1_exp_stm_exp_list_tail_opexp.oper);
        
        NumExp sub_tree_2_1_exp_stm_exp_list_tail_opexp_right = (NumExp) sub_tree_2_1_exp_stm_exp_list_tail_opexp.right;
        System.out.println("Subárvore 2 - Subárvore 1 - Segunda expressão do valor - Valor do Número Direito: " + sub_tree_2_1_exp_stm_exp_list_tail_opexp_right.num);      

        OpExp sub_tree_2_1_exp_opexp = (OpExp) sub_tree_2_1_exp.exp;
       
        NumExp sub_tree_2_1_exp_opexp_left = (NumExp) sub_tree_2_1_exp_opexp.left;
        System.out.println("Subárvore 2 - Subárvore 1  - Expressão - Valor do Número Esquerdo: " + sub_tree_2_1_exp_opexp_left.num);
      
        System.out.println("Subárvore 2 - Subárvore 1  - Expressão - Valor do Operador: " + sub_tree_2_1_exp_opexp.oper);
        
        IdExp sub_tree_2_1_exp_opexp_right = (IdExp) sub_tree_2_1_exp_opexp.right;
        System.out.println("Subárvore 2 - Subárvore 1  - Expressão - ID do Número Direito: " + sub_tree_2_1_exp_opexp_right.id);

        PrintStm sub_tree_2_2 = (PrintStm) sub_tree_2.stm2;
        
        LastExpList sub_tree_2_2_exps = (LastExpList) sub_tree_2_2.exps;
        
        IdExp sub_tree_2_2_exps_head = (IdExp) sub_tree_2_2_exps.head;
        
        System.out.println("Subárvore 2 - Subárvore 1 - ID da Última Lista de Exp: " + sub_tree_2_2_exps_head.id);

    }   
}
