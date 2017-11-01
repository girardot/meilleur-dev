package mdf2016.candydistributor;

/*******
 * Read input from System.in
 * Use System.out.println to ouput your result.
 * Use:
 * IsoContestBase.localEcho( variable)
 * to display variable in a dedicated area.
 ***/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IsoContest {


    public static void main(String[] argv) throws Exception {
        Scanner sc = new Scanner(System.in);
        final Integer M = Integer.parseInt(sc.nextLine());
        final int T = Integer.parseInt(sc.nextLine());
        HashMap<Integer, Integer> coins = new HashMap<>(T);

        while (sc.hasNextLine()) {
            final String[] split = sc.nextLine().split(" ");
            final Integer N = Integer.parseInt(split[0]);
            final Integer V = Integer.parseInt(split[1]);
            coins.put(V, N);
        }

        final Integer result = nbCoins(new Param(M, coins));
        if (result == null) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(result);
        }
    }

    public static HashMap<Param, Integer> cache = new HashMap<>();

    public static Integer nbCoins(Param p) {
        Integer nbCoins = null;
        if (p.amount == 0) {
            return 0;
        }

        for (Integer V : p.coins.keySet()) {
            if (p.coins.get(V) > 0) {
                final HashMap<Integer, Integer> coinsCopy = new HashMap<>(p.coins);
                coinsCopy.compute(V, (k, v) -> v - 1);
                final int residual = p.amount - V;
                Integer residualNbCoins;
                if (cache.containsKey(V)) {
                    residualNbCoins = cache.get(new Param(residual, coinsCopy));
                } else {
                    residualNbCoins = nbCoins(new Param(residual, coinsCopy));
                }
                if (residualNbCoins != null) {
                    if (nbCoins == null) {
                        nbCoins = 1 + residualNbCoins;
                    } else {
                        nbCoins = Math.min(nbCoins, 1 + residualNbCoins);
                    }
                }
            }
        }
        cache.put(p, nbCoins);
        return nbCoins;
    }

    private static class Param {
        final Integer amount;
        final HashMap<Integer, Integer> coins;

        private Param(Integer amount, HashMap<Integer, Integer> coins) {
            this.amount = amount;
            this.coins = coins;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Param param = (Param) o;

            if (amount != null ? !amount.equals(param.amount) : param.amount != null) return false;
            return !(coins != null ? !coins.equals(param.coins) : param.coins != null);

        }

        @Override
        public int hashCode() {
            int result = amount != null ? amount.hashCode() : 0;
            result = 31 * result + (coins != null ? coins.hashCode() : 0);
            return result;
        }
    }
}