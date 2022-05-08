/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhweka;

/**
 *
 * @author ASUS
 */
public class Laptrinhweka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
//        MyKnowledgeModel model = new MyKnowledgeModel
//        ("E:\\Program Files\\Weka-3-9-5\\data\\iris.arff");
//        System.out.println(model);
//        model.saveData("C:\\Users\\A\\Desktop\\project dataweka\\iris.arff");
//        model.saveData2CSV("C:\\Users\\A\\Desktop\\project dataweka\\iris_CSV.csv");
        

//        MyAprioriModel model = new MyAprioriModel(
//                "E:\\Program Files\\Weka-3-9-5\\data\\supermarket.arff",
//        "-N 10 -T 0 -C 0.9 -D 0.05 -U 1.0 -M 0.1 -S -1.0 -c -1",
//        "-R 1-9,11,57,70,79-81,88-89,98,100-102,107-114,116-120,122-130,137-179,189,192-199,201-216");
//        model.mineAssociationRules();
        
//        MyFPGrowthModel model = new MyFPGrowthModel (
//                "E:\\Program Files\\Weka-3-9-5\\data\\weather.nominal.arff",
//                "-P 2 -I -1 -N 10 -T 0 -C 0.7 -D 0.05 -U 1.0 -M 0.1",
//                "-N -R first-last");
//        
//        model.mineAssociationRules();
        
//        System.out.println(model); 
    
    MyKnowledgeModel model = new MyKnowledgeModel(
            "E:\\Program Files\\Weka-3-9-5\\data\\iris.arff",
            null, null);
    
            model.trainset = model.divideTrainTestR(model.dataset, 80, false);
            model.testset = model.divideTrainTestR(model.dataset, 80, true);
            System.out.println(model);
            System.out.println(model.trainset.toSummaryString());
            System.out.println(model.testset.toSummaryString());
    }
    
    
}
