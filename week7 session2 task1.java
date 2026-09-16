class UndergroundSystem {
    unordered_map<int, pair<string, int>> checkInData;
    unordered_map<string, pair<long long, int>> travelData;

public:
    UndergroundSystem() {
    }

    void checkIn(int id, string stationName, int t) {
        checkInData[id] = {stationName, t};
    }

    void checkOut(int id, string stationName, int t) {
        auto checkIn = checkInData[id];

        string route = checkIn.first + "#" + stationName;
        int travelTime = t - checkIn.second;

        travelData[route].first += travelTime;
        travelData[route].second++;

        checkInData.erase(id);
    }

    double getAverageTime(string startStation, string endStation) {
        string route = startStation + "#" + endStation;

        return (double)travelData[route].first /
               travelData[route].second;
    }
};

output:

Case 1
Case 2
Input
["UndergroundSystem","checkIn","checkIn","checkIn","checkOut","checkOut","checkOut","getAverageTime","getAverageTime","checkIn","getAverageTime","checkOut","getAverageTime"]
[[],[45,"Leyton",3],[32,"Paradise",8],[27,"Leyton",10],[45,"Waterloo",15],[27,"Waterloo",20],[32,"Cambridge",22],["Paradise","Cambridge"],["Leyton","Waterloo"],[10,"Leyton",24],["Leyton","Waterloo"],[10,"Waterloo",38],["Leyton","Waterloo"]]
Output
[null,null,null,null,null,null,null,14.00000,11.00000,null,11.00000,null,12.00000]
Expected
[null,null,null,null,null,null,null,14.00000,11.00000,null,11.00000,null,12.00000]
