import java.util.*;

public class DSA2 {
        public static List<String> largestItemAssociation(List<List<String>> itemAssociation) {
            Map<String, List<String>> graph = new HashMap<>();

            for (List<String> pair : itemAssociation){
                String a = pair.getFirst();
                String b = pair.get(1);

                graph.putIfAbsent(a, new ArrayList<>());
                graph.putIfAbsent(b, new ArrayList<>());

                graph.get(a).add(b);
                graph.get(b).add(a);
            }

            Set<String> visited = new HashSet<>();
            List<String> bestGroup = new ArrayList<>();

            for (String item : graph.keySet()){
                if(!visited.contains(item)){
                    List<String> currentGroup = new ArrayList<>();

                    dfs(item, graph, visited, currentGroup);

                    Collections.sort(currentGroup);

                    if(currentGroup.size() > bestGroup.size()){
                        bestGroup = currentGroup;
                    }else if (currentGroup.size() == bestGroup.size()){
                        if(currentGroup.getFirst().compareTo(bestGroup.getFirst()) < 0){
                            bestGroup = currentGroup;
                        }

                    }
                }
            }
            return bestGroup;
        }

        private static void dfs(
                String item,
                Map<String, List<String>> graph,
                Set<String> visited,
                List<String> group
        ) {
            visited.add(item);
            group.add(item);

            for (String neighbor : graph.get(item)){
                if(!visited.contains(neighbor)){
                    dfs(neighbor, graph, visited, group);
                }
            }
        }

        // teste manual
        public static void main(String[] args) {
            List<List<String>> listList = List.of(
                    List.of("item1", "item2"),
                    List.of("item3", "item4"),
                    List.of("item4", "item5")
            );

            System.out.println(largestItemAssociation(listList));
        }
}