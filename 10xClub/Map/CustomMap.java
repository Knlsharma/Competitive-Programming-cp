//package Map;
//
///**
// * @author Kunal Sharma at 13/03/22 6:55 PM
// */
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.LinkedList;
//
//
//public class CustomMap {
//
//
//
//    public static class HashMap<K,V>{
//
//        class HMPair {
//
//            K key;
//
//            V val;
//
//
//
//            HMPair (K key, V val){
//
//                this.key = key;
//
//                this.val = val;
//
//            }
//
//        }
//
//
//
//        int size;
//
//        LinkedList<HMPair>[] buckets;
//
//
//
//        public HashMap(){
//
//            size = 0;
//
//            initBuckets(4);
//
//        }
//
//
//
//        private void initBuckets(int N){
//
//            buckets = new LinkedList[N];
//
//            for(int bi = 0; bi < buckets.length; bi++){
//
//                buckets[bi] = new LinkedList<>();
//
//            }
//
//        }
//
//
//
//        public boolean containsKey(K key){
//
//            int bi = hashFunction(key);
//
//            int di = findInBucket(key, bi);
//
//
//
//            if(di == -1){
//
//                return false;
//
//            } else {
//
//                return true;
//
//            }
//
//        }
//
//
//
//        public V get(K key){
//
//            int bi = hashFunction(key);
//
//            int di = findInBucket(key, bi);
//
//
//
//            if(di == -1){
//
//                return null;
//
//            } else {
//
//                HMPair pair = buckets[bi].get(di);
//
//                return pair.val;
//
//            }
//
//        }
//
//
//
//        public V get(K key){
//
//            int bi = hashFunction(key);
//
//            int di = findInBucket(key, bi);
//
//
//
//            if(di == -1){
//
//                return null;
//
//            } else {
//
//                HMPair pair = buckets[bi].remove(di);
//
//                size--;
//
//                return pair.val;
//
//            }
//
//        }
//
//
//
//        public void put(K key, V val){
//
//            int bi = hashFunction(key);
//
//            int di = findInBucket(key, bi);
//
//
//
//            if(di == -1){
//
//                HMPair pair = new HMPair(key, val);
//
//                buckets[bi].add(pair);
//
//                size++;
//
//            } else {
//
//                HMPair pair = buckets[bi].get(di);
//
//                pair.val = val;
//
//            }
//
//        }
//
//
//
//        public ArrayList<K> keyset(){
//
//            ArrayList<K> keys = new ArrayList<>();
//
//
//
//            for(int bi = 0; bi < buckets.length; bi++){
//
//                for(int di = 0; di < buckets[bi].size(); di++){
//
//                    HMPair pair = buckets[bi].get(di);
//
//                    keys.add(pair.key);
//
//                }
//
//            }
//
//
//
//            return keys;
//
//        }
//
//
//
//        public void display(){
//
//            System.out.println("Display Begins");
//
//            for(int bi = 0; bi < buckets.length; bi++){
//
//                System.out.print("Bucket" + bi + " ");
//
//                for(int di = 0; di < buckets[bi].size(); di++){
//
//                    HMPair pair = buckets[bi].get(di);
//
//                    System.out.print(pair.key + "@" + pair.val + " ");
//
//                }
//
//                System.out.println(".");
//
//            }
//
//            System.out.println("Display Ends");
//
//        }
//
//
//
//        // gets a key and returns the bucket
//
//        private int hashFunction(K key){
//
//            int hash = key.hashCode();
//
//            int bi = Math.abs(hash) % buckets.length; // compression
//
//            return bi;
//
//        }
//
//
//
//        // where is key within the bucket (-1 if not in the bucket)
//
//        private int findInBucket(K key, int bi){
//
//            for(int di = 0; di < buckets[bi].size(); di++){
//
//                HMPair pair = buckets[bi].get(di);
//
//                if(pair.key.equals(key)){
//
//                    return di;
//
//                }
//
//            }
//
//
//
//            return -1;
//
//        }
//
//    }
//
//
//
//}
//
//
//
//    public static void main(String[] args) throws Exception {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//       HashMap<String, Integer> map = new HashMap();
//
//
//
//        String str = br.readLine();
//
//        while (str.equals("quit") == false) {
//
//            if (str.startsWith("put")) {
//
//                String[] parts = str.split(" ");
//
//                String key = parts[1];
//
//                Integer val = Integer.parseInt(parts[2]);
//
//                map.put(key, val);
//
//            } else if (str.startsWith("get")) {
//
//                String[] parts = str.split(" ");
//
//                String key = parts[1];
//
//                System.out.println(map.get(key));
//
//            } else if (str.startsWith("containsKey")) {
//
//                String[] parts = str.split(" ");
//
//                String key = parts[1];
//
//                System.out.println(map.containsKey(key));
//
//            } else if (str.startsWith("remove")) {
//
//                String[] parts = str.split(" ");
//
//                String key = parts[1];
//
//                System.out.println(map.remove(key));
//
//            } else if (str.startsWith("size")) {
//
//                System.out.println(map.size());
//
//            } else if (str.startsWith("keyset")) {
//
//                System.out.println(map.keyset());
//
//            } else if (str.startsWith("display")) {
//
//                map.display();
//
//            }
//
//            str = br.readLine();
//
//        }
//
//    }
//
//}