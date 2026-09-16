class BrowserHistory {
    vector<string> history;
    int current;

public:
    BrowserHistory(string homepage) {
        history.push_back(homepage);
        current = 0;
    }

    void visit(string url) {
        history.resize(current + 1);
        history.push_back(url);
        current++;
    }

    string back(int steps) {
        current = max(0, current - steps);
        return history[current];
    }

    string forward(int steps) {
        current = min((int)history.size() - 1, current + steps);
        return history[current];
    }
};

output:

Case 1
Input
["BrowserHistory","visit","visit","visit","back","back","forward","visit","forward","back","back"]
[["leetcode.com"],["google.com"],["facebook.com"],["youtube.com"],[1],[1],[1],["linkedin.com"],[2],[2],[7]]
Output
[null,null,null,null,"facebook.com","google.com","facebook.com",null,"linkedin.com","google.com","leetcode.com"]
Expected
[null,null,null,null,"facebook.com","google.com","facebook.com",null,"linkedin.com","google.com","leetcode.com"]
Contribute a 