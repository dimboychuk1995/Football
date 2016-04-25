package COM.DIM;

import java.util.*;

/**
 * Created by us9522 on 19.04.2016.
 */


public class Main {
    private static final int TEAMS_COUNT = 6;
    private static final int RESULT_PARAMETERS = 10;

    public static void main(String[] args) throws Exception {

        //insert data
        Team teams[] = new Team[TEAMS_COUNT];
        System.out.println("insert name teams");
        Scanner teamName = new Scanner(System.in);
        for (int i = 0; i < TEAMS_COUNT; i++){
            teams[i] = new Team(1,teamName.next());
            //System.out.print(teams[i].toString() + "   ");
        }

        //sout teams
        for(Team item: teams){
            System.out.println(item + " ");
        }

        dataDB.writeFirstData();

        //insert null data to database






//
//
//// write your code here
//
////����� ������ ���� ����������� ���� ������� ����
//        Integer teams[][] = new Integer[TEAMS_COUNT][RESULT_PARAMETERS];
////����� ���� �������� ���������� ��������������� ����
//        Integer teamsPre[][] = new Integer[TEAMS_COUNT][RESULT_PARAMETERS];
//
////�������� ����� ��� �������� ����������
//        Integer tempResultsTeam[] = new Integer[TEAMS_COUNT];
//        Integer tempResults[] = new Integer[TEAMS_COUNT];
//
//        System.out.println("After 0st tour");
////��������� ���������
//        System.out.println("�������� ��� ���� ����� ������� ͳ�� �������� г��.���� ����� ��������");
//        for(int i = 0; i < TEAMS_COUNT; i++){
//            for(int j = 0; j < RESULT_PARAMETERS; j++){
//                teams[i][0] = i;
//                teamsPre[i][0] = i;
//                if (j > 0){
//                    teams[i][j] = 0;
//                    teamsPre[i][j] = 0;
//                }
//                tempResultsTeam[i] = teams[i][0];
//                System.out.print(teams[i][j] + " ");
//            }
//            System.out.println("");
//        }
//
//        System.out.println("\n");
//
//        Scanner res = new Scanner(System.in);
//
//        System.out.println("\n������ �� ���������� ����:");
////��������� ����������
//        for (int i = 0; i < tempResultsTeam.length; i++){
//            System.out.print(tempResultsTeam[i] + " ");
//            System.out.print("team" + tempResultsTeam[i] + ":");
//            tempResults[i] = res.nextInt();
//        }
////��������� ���������� ������(�� ����� ������ ����� �������)
//        System.out.println("\nteam id");
//        for(int i = 0; i < tempResults.length; i++){
//            System.out.print(tempResultsTeam[i] + " ");
//        }
//        System.out.println("\nresult");
//        for(int i = 0; i < tempResults.length; i++){
//            System.out.print(tempResults[i] + " ");
//        }
//
////���������� ������� ������� ���� 1 ����
//        System.out.println("\n\nAfter 1st tour");
//        System.out.println("\n�������� ��� ���� ����� ������� ͳ�� �������� г��.���� ����� ��������\n");
//        for(int i = 0; i < TEAMS_COUNT; i++){
//            for(int j = 0; j < RESULT_PARAMETERS; j++){
//                teams[i][1] = 1;
//                teams[i][3] = 1;
//
//                //�����
//                teams[i][8] = tempResults[i];
//
//                //��������
//                //��� ������� � ������ �� �������� ��������
//                if ((i == 0) | (i % 2 == 0)){
//                    teams[i][9] = tempResults[i + 1];
//                //������ ��� ������ � ������ ���������
//                }else {
//                    teams[i][9] = tempResults[i - 1];
//                }
//
//                //������
//                teams[i][7] = teams[i][8] - teams[i][9];
//
//                //�������, ��� �� �������� ��� ������ � �������� �� ������ ��������
//                if (i == 0 || i % 2 == 0){
//                    if(tempResults[i] > tempResults[i + 1]){
//                        teams[i][4] = teamsPre[i][4] + 1;
//                    }else if(tempResults[i] < tempResults[i + 1]){
//                        teams[i][6] = teamsPre[i][6] + 1;
//                    }else{
//                        teams[i][5] = teamsPre[i][5] + 1;
//                    }
//                //�������, ��� �� �������� ��� ������ � �������� ��������
//                }else{
//                    if(tempResults[i - 1] < tempResults[i]){
//                        teams[i][4] = teamsPre[i][4] + 1;
//                    }else if (tempResults[i - 1] > tempResults[i]){
//                        teams[i][6] = teamsPre[i][6] + 1;
//                    }else{
//                        teams[i][5] = teamsPre[i][5] + 1;
//                    }
//                }
//
//                //� �������� ��������� ������ ���� ��� ��������
//                teams[i][2] = (teams[i][4] * 3) + (teams[i][5]);
//
//                //��������� ����� ���� ������ ���������� ��� ��������� ���
//                teamsPre[i][j] = teams[i][j];
//
//                System.out.print(teams[i][j] + "   ");
//            }
//            System.out.println("");
//        }
//
//        //��������� ��� � ����
//        Map<Integer, List<Integer>> mapTeam = new HashMap<Integer, List<Integer>>();
//        for(int i = 0; i < TEAMS_COUNT; i++) {
//            List<Integer> l = new ArrayList<Integer>();
//            for (int j = 1; j < RESULT_PARAMETERS; j++) {
//                l.add(teams[i][j]);
//            }
//            mapTeam.put(i, l);
//        }
//        for(Map.Entry<Integer, List<Integer>> lMap : mapTeam.entrySet()){
//            System.out.println(lMap.getKey() + "=" + lMap.getValue());
//            lMap.getValue();
//        }
//
     }
}
