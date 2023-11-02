ArrayList<Integer> hm = new ArrayList<>();
    boolean c = false, d = false;
    int aa = 0, b = 0;
    for (int i = 0; i < n; i++) {
      if (a[i] == x || a[i] == y) {
        if (a[i] == x) {
          aa = i + 1;
          c = true;
        } else {
          b = i + 1;
          d = true;
        }
        if (aa > 0 && b > 0) {
          int result = b - aa;
          if (result < 0) {
            hm.add(-result);
          } else {
            hm.add(result);
          }
        }
      }
    }
    if (!c || !d) {
      return -1;
    }
    Collections.sort(hm);
    return hm.get(0);
