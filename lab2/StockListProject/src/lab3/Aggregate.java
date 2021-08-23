package lab3;

class MainAggr {

    interface Aggregatable<IT, IP> {
        public IP Aggregating(IT arrayElement, IP Aggregat);
    }

    public static <P,T> P aggregate(T[] arr, Aggregatable <T, P> aggr, P start) {
        for (T x : arr) {
            start = (P) aggr.Aggregating(x, start);
        }
        return start;
    }

    public static void main(String[] args) {
            System.out.println(aggregate(new Long[] {2L, 3L, 4L}, (e, a) -> {return (Long)((Long)e + (Long)a);}, 0L));
            System.out.println(aggregate(new Long[] {2L, 3L, 4L}, (e, a) -> {return (String)(String.valueOf(e) + String.valueOf(a));}, " "));
        }

    }