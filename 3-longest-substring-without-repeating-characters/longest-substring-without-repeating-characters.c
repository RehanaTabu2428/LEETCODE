int lengthOfLongestSubstring(char* s) {
    int lastIndex[256];
    for (int i = 0; i < 256; i++) {
        lastIndex[i] = -1;  // -1 means character hasn't appeared yet
    }

    int maxLen = 0;
    int start = 0;  // left edge of current window

    for (int end = 0; s[end] != '\0'; end++) {
        unsigned char c = s[end];

        // If this character was seen inside the current window, shrink window
        if (lastIndex[c] >= start) {
            start = lastIndex[c] + 1;
        }

        lastIndex[c] = end;

        int currentLen = end - start + 1;
        if (currentLen > maxLen) {
            maxLen = currentLen;
        }
    }

    return maxLen;
}