# quarkus-locust

This project is based in [quarkus-prometheus-grafana's repository](https://github.com/serrodcal/quarkus-prometheus-grafana) and the idea is to look into locust.

```sh
$ kubectl apply -f k8s
```

```sh
$ kubectl port-forward -n locust locust-<pod> 8089
```

```sh
$ kubectl port-forward -n monitoring grafana-<pod> 3000
```
