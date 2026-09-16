class ThroneInheritance {
    string king;
    unordered_map<string, vector<string>> children;
    unordered_set<string> dead;

public:
    ThroneInheritance(string kingName) {
        king = kingName;
    }

    void birth(string parentName, string childName) {
        children[parentName].push_back(childName);
    }

    void death(string name) {
        dead.insert(name);
    }

    void dfs(string name, vector<string>& order) {
        if (!dead.count(name)) {
            order.push_back(name);
        }

        for (string child : children[name]) {
            dfs(child, order);
        }
    }

    vector<string> getInheritanceOrder() {
        vector<string> order;
        dfs(king, order);
        return order;
    }
};


output:


Case 1
Input
["ThroneInheritance","birth","birth","birth","birth","birth","birth","getInheritanceOrder","death","getInheritanceOrder"]
[["king"],["king","andy"],["king","bob"],["king","catherine"],["andy","matthew"],["bob","alex"],["bob","asha"],[null],["bob"],[null]]
Output
[null,null,null,null,null,null,null,["king","andy","matthew","bob","alex","asha","catherine"],null,["king","andy","matthew","alex","asha","catherine"]]
Expected
[null,null,null,null,null,null,null,["king","andy","matthew","bob","alex","asha","catherine"],null,["king","andy","matthew","alex","asha","catherine"]]
