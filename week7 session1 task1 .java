class ParkingSystem {
private:
    int slots[4];

public:
    ParkingSystem(int big, int medium, int small) {
        slots[1] = big;
        slots[2] = medium;
        slots[3] = small;
    }

    bool addCar(int carType) {
        if (slots[carType] == 0) {
            return false;
        }

        slots[carType]--;
        return true;
    }
};

output:

Case 1
Input
["ParkingSystem","addCar","addCar","addCar","addCar"]
[[1,1,0],[1],[2],[3],[1]]
Output
[null,true,true,false,false]
Expected
[null,true,true,false,false]
