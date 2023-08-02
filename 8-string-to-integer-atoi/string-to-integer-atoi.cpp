
#include <climits>
class Solution {
public:
    int myAtoi(string s) {
        long long int num = 0;
    int n = s.size(), i = 0, flag = 1;

    // Remove leading whitespaces
    while (i < n && s[i] == ' ') {
        i++;
    }

    // Check for a sign character
    if (i < n && (s[i] == '-' || s[i] == '+')) {
        flag = (s[i] == '-') ? -1 : 1;
        i++;
    }

    // Parse the digits
    while (i < n && s[i] >= '0' && s[i] <= '9') {
        num = num * 10 + (s[i] - '0');

        // Check for overflow
        if (num > INT_MAX) {
            return (flag == 1) ? INT_MAX : INT_MIN;
        }

        i++;
        
    }
    return flag * static_cast<int>(num);
    }    
};