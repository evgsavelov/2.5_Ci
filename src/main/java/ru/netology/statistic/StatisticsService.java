package ru.netology.statistic;

public class StatisticsService {
    /**
     * Calculate index of max income
     *
     * @param incomes - array of incomes
     * @return - index of first max value
     */
    public long findMax(long[] incomes) {
        long current_max_index = 0;
        long current_max = incomes[0];
        for (long income : incomes)
            if (current_max < income)
                current_max = income;
        return current_max;
    }

    public int findMinMonth(int[] month){
        int monthMin = month[0];
        int counterMonth = 0;
        int returnMonth = 1;
        for(int x : month){
            counterMonth++;
            if(monthMin >= x){
                monthMin = x;
                returnMonth = counterMonth;
            }
        }
        return returnMonth;
    }

}
